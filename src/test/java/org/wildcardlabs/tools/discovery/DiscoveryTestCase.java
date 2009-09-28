/*
 * Discovery
 * http://src.wildcardlabs.org/discovery
 *
 * Copyright (c) 2009-Present WildcardLabs. All rights reserved.
 * See LICENSE for more info.
 */
package org.wildcardlabs.tools.discovery;

import java.util.Calendar;

import junit.framework.TestCase;

/**
 * Discovery test class.
 *
 * @author Deluxe
 */
public final class DiscoveryTestCase extends TestCase {

	/**
	 * Stress test.
	 * <code>null</code> object display.
	 */
	public void testNullObject() {
		DiscoveryTestCase.assertEquals("null\n", Discovery.toString(null));
	}

	/**
	 * Stress test.
	 * <code>Object</code> display.
	 */
	public void testNewObject() {
		DiscoveryTestCase.assertEquals("", Discovery.toString(new Object()));
	}

	/**
	 * Stress test.
	 * Empty <code>String</code> display.
	 */
	public void testEmptyString() {
		StringBuffer toStringBuffer = new StringBuffer();
		toStringBuffer.append("String.value = []\n");
		toStringBuffer.append("String.offset = 0\n");
		toStringBuffer.append("String.count = 0\n");
		toStringBuffer.append("String.hash = 0\n");
		toStringBuffer.append("String.serialVersionUID = -6849794470754667710\n");
		toStringBuffer.append("String.serialPersistentFields = []\n");
		toStringBuffer.append("String.CASE_INSENSITIVE_ORDER = ");
		toStringBuffer.append(String.CASE_INSENSITIVE_ORDER);
		toStringBuffer.append("\n");

		DiscoveryTestCase.assertEquals(toStringBuffer.toString(), Discovery.toString(""));
	}

	/**
	 * Stress test.
	 * <code>Discover</code> class display.
	 */
	public void testDiscoverClass() {
		// Class content change with JVM version
		DiscoveryTestCase.assertNotNull("expected:<not null> but was:<null>", Discovery.toString(Discovery.class));
	}

	/**
	 * Standard test.
	 * <code>ExtendingObject</code> display.
	 */
	public void testExtendingObject() {
		Calendar toStringCalendar = Calendar.getInstance();
		toStringCalendar.setTimeInMillis(0);

		StringBuffer toStringBuffer = new StringBuffer();
		toStringBuffer.append("GrandSuperclassObject.pubIntGS = 117\n");
		toStringBuffer.append("GrandSuperclassObject.pubFloatGS = 0.5\n");
		toStringBuffer.append("GrandSuperclassObject.pubLongGS = 9876543210\n");
		toStringBuffer.append("GrandSuperclassObject.pubDoubleGS = 9.876543210012346E9\n");
		toStringBuffer.append("GrandSuperclassObject.pubNullGS = null\n");
		toStringBuffer.append("GrandSuperclassObject.pubStringGS = deluxe\n");
		toStringBuffer.append("GrandSuperclassObject.pubCalendarGS = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("GrandSuperclassObject.pubVoidArrayGS = []\n");
		toStringBuffer.append("GrandSuperclassObject.pubArrayGS = [7, 17, 117]\n");
		toStringBuffer.append("GrandSuperclassObject.pubTripleArrayGS = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("GrandSuperclassObject.pubVoidCollectionGS = []\n");
		toStringBuffer.append("GrandSuperclassObject.pubCollectionGS = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("GrandSuperclassObject.pubMiscCollectionGS = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("GrandSuperclassObject.proIntGS = 117\n");
		toStringBuffer.append("GrandSuperclassObject.proFloatGS = 0.5\n");
		toStringBuffer.append("GrandSuperclassObject.proLongGS = 9876543210\n");
		toStringBuffer.append("GrandSuperclassObject.proDoubleGS = 9.876543210012346E9\n");
		toStringBuffer.append("GrandSuperclassObject.proNullGS = null\n");
		toStringBuffer.append("GrandSuperclassObject.proStringGS = deluxe\n");
		toStringBuffer.append("GrandSuperclassObject.proCalendarGS = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("GrandSuperclassObject.proVoidArrayGS = []\n");
		toStringBuffer.append("GrandSuperclassObject.proArrayGS = [7, 17, 117]\n");
		toStringBuffer.append("GrandSuperclassObject.proTripleArrayGS = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("GrandSuperclassObject.proVoidCollectionGS = []\n");
		toStringBuffer.append("GrandSuperclassObject.proCollectionGS = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("GrandSuperclassObject.proMiscCollectionGS = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("GrandSuperclassObject.privIntGS = 117\n");
		toStringBuffer.append("GrandSuperclassObject.privFloatGS = 0.5\n");
		toStringBuffer.append("GrandSuperclassObject.privLongGS = 9876543210\n");
		toStringBuffer.append("GrandSuperclassObject.privDoubleGS = 9.876543210012346E9\n");
		toStringBuffer.append("GrandSuperclassObject.privNullGS = null\n");
		toStringBuffer.append("GrandSuperclassObject.privStringGS = deluxe\n");
		toStringBuffer.append("GrandSuperclassObject.privCalendarGS = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("GrandSuperclassObject.privVoidArrayGS = []\n");
		toStringBuffer.append("GrandSuperclassObject.privArrayGS = [7, 17, 117]\n");
		toStringBuffer.append("GrandSuperclassObject.privTripleArrayGS = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("GrandSuperclassObject.privVoidCollectionGS = []\n");
		toStringBuffer.append("GrandSuperclassObject.privCollectionGS = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("GrandSuperclassObject.privMiscCollectionGS = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("SuperclassObject.pubIntS = 117\n");
		toStringBuffer.append("SuperclassObject.pubFloatS = 0.5\n");
		toStringBuffer.append("SuperclassObject.pubLongS = 9876543210\n");
		toStringBuffer.append("SuperclassObject.pubDoubleS = 9.876543210012346E9\n");
		toStringBuffer.append("SuperclassObject.pubNullS = null\n");
		toStringBuffer.append("SuperclassObject.pubStringS = deluxe\n");
		toStringBuffer.append("SuperclassObject.pubCalendarS = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("SuperclassObject.pubVoidArrayS = []\n");
		toStringBuffer.append("SuperclassObject.pubArrayS = [7, 17, 117]\n");
		toStringBuffer.append("SuperclassObject.pubTripleArrayS = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("SuperclassObject.pubVoidCollectionS = []\n");
		toStringBuffer.append("SuperclassObject.pubCollectionS = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("SuperclassObject.pubMiscCollectionS = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("SuperclassObject.proIntS = 117\n");
		toStringBuffer.append("SuperclassObject.proFloatS = 0.5\n");
		toStringBuffer.append("SuperclassObject.proLongS = 9876543210\n");
		toStringBuffer.append("SuperclassObject.proDoubleS = 9.876543210012346E9\n");
		toStringBuffer.append("SuperclassObject.proNullS = null\n");
		toStringBuffer.append("SuperclassObject.proStringS = deluxe\n");
		toStringBuffer.append("SuperclassObject.proCalendarS = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("SuperclassObject.proVoidArrayS = []\n");
		toStringBuffer.append("SuperclassObject.proArrayS = [7, 17, 117]\n");
		toStringBuffer.append("SuperclassObject.proTripleArrayS = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("SuperclassObject.proVoidCollectionS = []\n");
		toStringBuffer.append("SuperclassObject.proCollectionS = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("SuperclassObject.proMiscCollectionS = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("SuperclassObject.privIntS = 117\n");
		toStringBuffer.append("SuperclassObject.privFloatS = 0.5\n");
		toStringBuffer.append("SuperclassObject.privLongS = 9876543210\n");
		toStringBuffer.append("SuperclassObject.privDoubleS = 9.876543210012346E9\n");
		toStringBuffer.append("SuperclassObject.privNullS = null\n");
		toStringBuffer.append("SuperclassObject.privStringS = deluxe\n");
		toStringBuffer.append("SuperclassObject.privCalendarS = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("SuperclassObject.privVoidArrayS = []\n");
		toStringBuffer.append("SuperclassObject.privArrayS = [7, 17, 117]\n");
		toStringBuffer.append("SuperclassObject.privTripleArrayS = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("SuperclassObject.privVoidCollectionS = []\n");
		toStringBuffer.append("SuperclassObject.privCollectionS = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("SuperclassObject.privMiscCollectionS = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("ExtendingObject.pubInt = 117\n");
		toStringBuffer.append("ExtendingObject.pubFloat = 0.5\n");
		toStringBuffer.append("ExtendingObject.pubLong = 9876543210\n");
		toStringBuffer.append("ExtendingObject.pubDouble = 9.876543210012346E9\n");
		toStringBuffer.append("ExtendingObject.pubNull = null\n");
		toStringBuffer.append("ExtendingObject.pubString = deluxe\n");
		toStringBuffer.append("ExtendingObject.pubCalendar = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("ExtendingObject.pubVoidArray = []\n");
		toStringBuffer.append("ExtendingObject.pubArray = [7, 17, 117]\n");
		toStringBuffer.append("ExtendingObject.pubTripleArray = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("ExtendingObject.pubVoidCollection = []\n");
		toStringBuffer.append("ExtendingObject.pubCollection = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("ExtendingObject.pubMiscCollection = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("ExtendingObject.proInt = 117\n");
		toStringBuffer.append("ExtendingObject.proFloat = 0.5\n");
		toStringBuffer.append("ExtendingObject.proLong = 9876543210\n");
		toStringBuffer.append("ExtendingObject.proDouble = 9.876543210012346E9\n");
		toStringBuffer.append("ExtendingObject.proNull = null\n");
		toStringBuffer.append("ExtendingObject.proString = deluxe\n");
		toStringBuffer.append("ExtendingObject.proCalendar = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("ExtendingObject.proVoidArray = []\n");
		toStringBuffer.append("ExtendingObject.proArray = [7, 17, 117]\n");
		toStringBuffer.append("ExtendingObject.proTripleArray = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("ExtendingObject.proVoidCollection = []\n");
		toStringBuffer.append("ExtendingObject.proCollection = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("ExtendingObject.proMiscCollection = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");
		toStringBuffer.append("ExtendingObject.privInt = 117\n");
		toStringBuffer.append("ExtendingObject.privFloat = 0.5\n");
		toStringBuffer.append("ExtendingObject.privLong = 9876543210\n");
		toStringBuffer.append("ExtendingObject.privDouble = 9.876543210012346E9\n");
		toStringBuffer.append("ExtendingObject.privNull = null\n");
		toStringBuffer.append("ExtendingObject.privString = deluxe\n");
		toStringBuffer.append("ExtendingObject.privCalendar = ");
		toStringBuffer.append(toStringCalendar);
		toStringBuffer.append("\n");
		toStringBuffer.append("ExtendingObject.privVoidArray = []\n");
		toStringBuffer.append("ExtendingObject.privArray = [7, 17, 117]\n");
		toStringBuffer.append("ExtendingObject.privTripleArray = [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]]\n");
		toStringBuffer.append("ExtendingObject.privVoidCollection = []\n");
		toStringBuffer.append("ExtendingObject.privCollection = [deadlands, dragoon, deluxe]\n");
		toStringBuffer.append("ExtendingObject.privMiscCollection = [[], [7, 17, 117], [[[3, 13, 113], [7, 17, 117]], [[1, 11], [9, 19]]], [], [deadlands, dragoon, deluxe]]\n");

		DiscoveryTestCase.assertEquals(toStringBuffer.toString(), Discovery.toString(new ExtendingObject()));
	}

}
