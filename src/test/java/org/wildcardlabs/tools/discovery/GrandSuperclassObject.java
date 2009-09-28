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

public class GrandSuperclassObject {

	public int pubIntGS = 117;
	public float pubFloatGS = 0.5F;
	public long pubLongGS = 9876543210L;
	public double pubDoubleGS = 9876543210.0123456789D;

	public Integer pubNullGS = null;
	public String pubStringGS = "deluxe";
	public Calendar pubCalendarGS = Calendar.getInstance();

	public int[] pubVoidArrayGS = {};
	public int[] pubArrayGS = {7, 17, 117};
	public int[][][] pubTripleArrayGS = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	public ArrayList pubVoidCollectionGS = new ArrayList();
	public ArrayList pubCollectionGS = null;
	public LinkedList pubMiscCollectionGS = null;

	protected int proIntGS = 117;
	protected float proFloatGS = 0.5F;
	protected long proLongGS = 9876543210L;
	protected double proDoubleGS = 9876543210.0123456789D;

	protected Integer proNullGS = null;
	protected String proStringGS = "deluxe";
	protected Calendar proCalendarGS = Calendar.getInstance();

	protected int[] proVoidArrayGS = {};
	protected int[] proArrayGS = {7, 17, 117};
	protected int[][][] proTripleArrayGS = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	protected ArrayList proVoidCollectionGS = new ArrayList();
	protected ArrayList proCollectionGS = null;
	protected LinkedList proMiscCollectionGS = null;

	private int privIntGS = 117;
	private float privFloatGS = 0.5F;
	private long privLongGS = 9876543210L;
	private double privDoubleGS = 9876543210.0123456789D;

	private Integer privNullGS = null;
	private String privStringGS = "deluxe";
	private Calendar privCalendarGS = Calendar.getInstance();

	private int[] privVoidArrayGS = {};
	private int[] privArrayGS = {7, 17, 117};
	private int[][][] privTripleArrayGS = {{{3, 13, 113}, {7, 17, 117}}, {{1, 11}, {9, 19}}};
	private ArrayList privVoidCollectionGS = new ArrayList();
	private ArrayList privCollectionGS = null;
	private LinkedList privMiscCollectionGS = null;

	public GrandSuperclassObject() {
		pubCalendarGS.setTimeInMillis(0);

		pubCollectionGS = new ArrayList();
		pubCollectionGS.add("deadlands");
		pubCollectionGS.add("dragoon");
		pubCollectionGS.add("deluxe");

		pubMiscCollectionGS = new LinkedList();
		pubMiscCollectionGS.add(pubVoidArrayGS);
		pubMiscCollectionGS.add(pubArrayGS);
		pubMiscCollectionGS.add(pubTripleArrayGS);
		pubMiscCollectionGS.add(pubVoidCollectionGS);
		pubMiscCollectionGS.add(pubCollectionGS);

		proCalendarGS.setTimeInMillis(0);

		proCollectionGS = new ArrayList();
		proCollectionGS.add("deadlands");
		proCollectionGS.add("dragoon");
		proCollectionGS.add("deluxe");

		proMiscCollectionGS = new LinkedList();
		proMiscCollectionGS.add(proVoidArrayGS);
		proMiscCollectionGS.add(proArrayGS);
		proMiscCollectionGS.add(proTripleArrayGS);
		proMiscCollectionGS.add(proVoidCollectionGS);
		proMiscCollectionGS.add(proCollectionGS);

		privCalendarGS.setTimeInMillis(0);

		privCollectionGS = new ArrayList();
		privCollectionGS.add("deadlands");
		privCollectionGS.add("dragoon");
		privCollectionGS.add("deluxe");

		privMiscCollectionGS = new LinkedList();
		privMiscCollectionGS.add(privVoidArrayGS);
		privMiscCollectionGS.add(privArrayGS);
		privMiscCollectionGS.add(privTripleArrayGS);
		privMiscCollectionGS.add(privVoidCollectionGS);
		privMiscCollectionGS.add(privCollectionGS);
	}

}
