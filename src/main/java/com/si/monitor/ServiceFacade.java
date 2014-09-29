package com.si.monitor;

public class ServiceFacade {
	public Composite[] getComposites() {
		return null;
	}

	public Composite getComposite(Long dbId) {
		return null;
	}

	public Long createOrUpdatePlane(String name, Composite[] itens) {
		return null;
	}

	public StateRule[] getStateRules() {
		return null;
	}

	public AnalysisType[] getAnalysisTypes() {
		return null;
	}

	public Value[] getValues() {
		return null;
	}
}

class TreeService {

}

class ServerEndPoint {
	ServiceFacade serviceFacade;
	public void onOpen(Session s){}
	public void onMessage(String msg, Session session){}
	public void onClose(Session session, boolean closeReason){}
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

interface Session {
	
}

