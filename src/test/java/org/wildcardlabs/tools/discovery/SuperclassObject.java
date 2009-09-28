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

public class SuperclassObject extends GrandSuperclassObject {

	public int pubIntS = 117;
	public float pubFloatS = 0.5F;
	public long pubLongS = 9876543210L;
	public double pubDoubleS = 9876543210.0123456789D;

	public Integer pubNullS = null;
	public String pubStringS = "deluxe";
	public Calendar pubCalendarS = Calendar.getInstance();

	public int[] pubVoidArrayS = {};
	public int[] pubArrayS = {7, 17, 117};
	public int[][][] pubTripleArrayS = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	public ArrayList pubVoidCollectionS = new ArrayList();
	public ArrayList pubCollectionS = null;
	public LinkedList pubMiscCollectionS = null;

	protected int proIntS = 117;
	protected float proFloatS = 0.5F;
	protected long proLongS = 9876543210L;
	protected double proDoubleS = 9876543210.0123456789D;

	protected Integer proNullS = null;
	protected String proStringS = "deluxe";
	protected Calendar proCalendarS = Calendar.getInstance();

	protected int[] proVoidArrayS = {};
	protected int[] proArrayS = {7, 17, 117};
	protected int[][][] proTripleArrayS = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	protected ArrayList proVoidCollectionS = new ArrayList();
	protected ArrayList proCollectionS = null;
	protected LinkedList proMiscCollectionS = null;

	private int privIntS = 117;
	private float privFloatS = 0.5F;
	private long privLongS = 9876543210L;
	private double privDoubleS = 9876543210.0123456789D;

	private Integer privNullS = null;
	private String privStringS = "deluxe";
	private Calendar privCalendarS = Calendar.getInstance();

	private int[] privVoidArrayS = {};
	private int[] privArrayS = {7, 17, 117};
	private int[][][] privTripleArrayS = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	private ArrayList privVoidCollectionS = new ArrayList();
	private ArrayList privCollectionS = null;
	private LinkedList privMiscCollectionS = null;

	public SuperclassObject() {
		pubCalendarS.setTimeInMillis(0);

		pubCollectionS = new ArrayList();
		pubCollectionS.add("deadlands");
		pubCollectionS.add("dragoon");
		pubCollectionS.add("deluxe");

		pubMiscCollectionS = new LinkedList();
		pubMiscCollectionS.add(pubVoidArrayS);
		pubMiscCollectionS.add(pubArrayS);
		pubMiscCollectionS.add(pubTripleArrayS);
		pubMiscCollectionS.add(pubVoidCollectionS);
		pubMiscCollectionS.add(pubCollectionS);

		proCalendarS.setTimeInMillis(0);

		proCollectionS = new ArrayList();
		proCollectionS.add("deadlands");
		proCollectionS.add("dragoon");
		proCollectionS.add("deluxe");

		proMiscCollectionS = new LinkedList();
		proMiscCollectionS.add(proVoidArrayS);
		proMiscCollectionS.add(proArrayS);
		proMiscCollectionS.add(proTripleArrayS);
		proMiscCollectionS.add(proVoidCollectionS);
		proMiscCollectionS.add(proCollectionS);

		privCalendarS.setTimeInMillis(0);

		privCollectionS = new ArrayList();
		privCollectionS.add("deadlands");
		privCollectionS.add("dragoon");
		privCollectionS.add("deluxe");

		privMiscCollectionS = new LinkedList();
		privMiscCollectionS.add(privVoidArrayS);
		privMiscCollectionS.add(privArrayS);
		privMiscCollectionS.add(privTripleArrayS);
		privMiscCollectionS.add(privVoidCollectionS);
		privMiscCollectionS.add(privCollectionS);
	}

}
