/*
 * Discovery
 * http://src.wildcardlabs.org/discovery
 *
 * Copyright (c) 2009-Present WildcardLabs. All rights reserved.
 * See LICENSE for more info.
 */
package org.wildcardlabs.tools.discovery;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;

public final class ExtendingObject extends SuperclassObject {

	public int pubInt = 117;
	public float pubFloat = 0.5F;
	public long pubLong = 9876543210L;
	public double pubDouble = 9876543210.0123456789D;

	public Integer pubNull = null;
	public String pubString = "deluxe";
	public Calendar pubCalendar = Calendar.getInstance();

	public int[] pubVoidArray = {};
	public int[] pubArray = {7, 17, 117};
	public int[][][] pubTripleArray = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	public ArrayList pubVoidCollection = new ArrayList();
	public ArrayList pubCollection = null;
	public LinkedList pubMiscCollection = null;

	protected int proInt = 117;
	protected float proFloat = 0.5F;
	protected long proLong = 9876543210L;
	protected double proDouble = 9876543210.0123456789D;

	protected Integer proNull = null;
	protected String proString = "deluxe";
	protected Calendar proCalendar = Calendar.getInstance();

	protected int[] proVoidArray = {};
	protected int[] proArray = {7, 17, 117};
	protected int[][][] proTripleArray = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	protected ArrayList proVoidCollection = new ArrayList();
	protected ArrayList proCollection = null;
	protected LinkedList proMiscCollection = null;

	private int privInt = 117;
	private float privFloat = 0.5F;
	private long privLong = 9876543210L;
	private double privDouble = 9876543210.0123456789D;

	private Integer privNull = null;
	private String privString = "deluxe";
	private Calendar privCalendar = Calendar.getInstance();

	private int[] privVoidArray = {};
	private int[] privArray = {7, 17, 117};
	private int[][][] privTripleArray = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	private ArrayList privVoidCollection = new ArrayList();
	private ArrayList privCollection = null;
	private LinkedList privMiscCollection = null;

	public ExtendingObject() {
		pubCalendar.setTimeInMillis(0);

		pubCollection = new ArrayList();
		pubCollection.add("deadlands");
		pubCollection.add("dragoon");
		pubCollection.add("deluxe");

		pubMiscCollection = new LinkedList();
		pubMiscCollection.add(pubVoidArray);
		pubMiscCollection.add(pubArray);
		pubMiscCollection.add(pubTripleArray);
		pubMiscCollection.add(pubVoidCollection);
		pubMiscCollection.add(pubCollection);

		proCalendar.setTimeInMillis(0);

		proCollection = new ArrayList();
		proCollection.add("deadlands");
		proCollection.add("dragoon");
		proCollection.add("deluxe");

		proMiscCollection = new LinkedList();
		proMiscCollection.add(proVoidArray);
		proMiscCollection.add(proArray);
		proMiscCollection.add(proTripleArray);
		proMiscCollection.add(proVoidCollection);
		proMiscCollection.add(proCollection);

		privCalendar.setTimeInMillis(0);

		privCollection = new ArrayList();
		privCollection.add("deadlands");
		privCollection.add("dragoon");
		privCollection.add("deluxe");

		privMiscCollection = new LinkedList();
		privMiscCollection.add(privVoidArray);
		privMiscCollection.add(privArray);
		privMiscCollection.add(privTripleArray);
		privMiscCollection.add(privVoidCollection);
		privMiscCollection.add(privCollection);
	}

}
