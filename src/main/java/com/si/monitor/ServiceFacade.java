package com.si.monitor;

public class ServiceFacade {
	public void getComposites() {

	}

	public void getComposite() {

	}

	public void createOrUpdatePlane() {

	}

	public void getStateRules() {

	}

	public void getAnalysisTypes() {

	}

	public void getValues() {

	}
}

class Composite {
	Composite parent;
	Long id;
	Long dbId;
	Detail detail;
}

class Detail {
	String name;
	Position position;
	CompositeType type;
	String cssClass;
	AnalysisType analysisType;
}

class Position {
	Float x;
	Float y;
	Float z;
}

class StateRule {
}

class Value {
}

enum AnalysisType {
	AVG
}

enum CompositeType {
	GROUP
}

enum ACTION {
	ACTION, GET_COMPOSITES, GET_COMPOSITE, CREATE_OR_UPDATE_PLANE, GET_STATE_RULES, GET_ANALYSIS_TYPES
}
