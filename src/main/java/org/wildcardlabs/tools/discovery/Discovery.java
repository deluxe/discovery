/*
 * Discovery
 * http://src.wildcardlabs.org/discovery
 *
 * Copyright (c) 2009-Present WildcardLabs. All rights reserved.
 * See LICENSE for more info.
 */
package org.wildcardlabs.tools.discovery;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Tool for discovering object content.
 *
 * @author Deluxe
 */
public final class Discovery {

	/**
	 * Private constructor
	 */
	private Discovery() {}

	/**
	 * Returns a generic string representation of an object.
	 * <br>
	 * The <code>toString</code> method returns a string consisting of the name
	 * of the class (and superclass's) of which the object is an instance and a
	 * string representation of its fields.
	 *
	 * @param	object the <code>Object</code> to represent.
	 * @return	a string representation of the object.
	 */
	public static String toString(Object object) {
		if (object == null)
			return "null\n";

		StringBuffer sb = new StringBuffer();
		LinkedList overallFields = new LinkedList();

		// Retrieving class and superclass fields
		Class currentClass = object.getClass();
		while (currentClass != null) {
			overallFields.addFirst(currentClass.getDeclaredFields());
			currentClass = currentClass.getSuperclass();
		}

		// Displaying fields
		for (Iterator iter = overallFields.iterator(); iter.hasNext();) {
			Field[] fields = (Field[]) iter.next();

			if (fields.length > 0) {
				String className = getClassShortName(fields[0].getDeclaringClass());

				for (int i = 0; i < fields.length; i++) {
					sb.append(className).append(".").append(fields[i].getName()).append(" = ");

					// Checking accessibility
					if (!fields[i].isAccessible())
						fields[i].setAccessible(true);

					// Retrieving content in the form of objects (including wrappers) and displaying
					try {
						contentDisplay(sb, fields[i].get(object));
					} catch (IllegalAccessException e) {
						sb.append("IllegalAccessException");
					}

					sb.append("\n");
				}
			}
		}

		return sb.toString();
	}

	/**
	 * Appends the string representation of the content to the string buffer.
	 *
	 * @param	sb the <code>StringBuffer</code> to append the object to.
	 * @param	content the <code>Object</code> to append.
	 * @return	a reference to the stringBuffer.
	 */
	private static StringBuffer contentDisplay(StringBuffer sb, Object content) {
		if (content == null) {
			// Displaying null content
			sb.append("null");
		} else {
			if (content instanceof Collection) {
				// Displaying collections
				Collection contentCollection = (Collection) content;

				if (contentCollection.isEmpty()) {
					sb.append("[]");
				} else {
					sb.append("[");

					for (Iterator iter = contentCollection.iterator(); iter.hasNext();) {
						contentDisplay(sb, iter.next()).append(", ");
					}

					sb.delete(sb.length() - 2, sb.length()).append("]");
				}
			}
			else if (content.getClass().isArray()) {
				// Displaying arrays
				if (Array.getLength(content) == 0) {
					sb.append("[]");
				} else {
					sb.append("[");

					for (int i = 0; i < Array.getLength(content); i++) {
						contentDisplay(sb, Array.get(content, i)).append(", ");
					}

					sb.delete(sb.length() - 2, sb.length()).append("]");
				}
			} else {
				// Displaying objects
				sb.append(content.toString());
			}
		}

		return sb;
	}

	/**
	 * Returns the class short name.
	 *
	 * @param	clazz the <code>Class</code> to get the short name from. 
	 * @return	the class short name.
	 */
	private static String getClassShortName(Class clazz) {
		String className = clazz.getName();
		return className.substring(className.lastIndexOf('.') + 1);
	}

}
