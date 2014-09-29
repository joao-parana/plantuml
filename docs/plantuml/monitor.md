# Monitor do SOMA

	@startuml
	
	class ServiceFacade {
		+Composite[] getComposites()
		+Composite getComposite(DbId)
		+DbId createOrUpdatePlane(name, Composite[])
		+StateRule[] getStateRules()
		+AnalysisType[] getAnalysisTypes()
		+Value[] getValues()
	}
	class TreeService {
	}
	class ServerEndPoint {
		+ServiceFacade facade
		+void onOpen(session)
		+void onMessage(msg, session)
		+void onClose(session)
	}
	class Composite {
		+Composite parent
		+Long id
		+Long dbId
		+Detail detail
	}
	class Detail {
		+String name
		+Position position
		+CompositeType type
		+String cssClass
		+AnalysisType analysisType
	}
	class Position {
		+Float x
		+Float y
		+Float z
	}
	class StateRule {
	}
	class Value {
	}
	enum AnalysisType {
		AVG
		MIN
		MAX
		...
	}
	enum CompositeType {
		GROUP
		...
	}
	enum ACTION {
		GET_COMPOSITES
		GET_COMPOSITE
		CREATE_OR_UPDATE_PLANE
		GET_STATE_RULES
		GET_ANALYSIS_TYPES
	}
	
	ServiceFacade --> TreeService 
	ServiceFacade ..> AnalysisType
	ServiceFacade ..> StateRule
	ServiceFacade ..> Value
	ServerEndPoint -> ServiceFacade
	TreeService --> Composite
	Composite -> Detail
	Detail ->Position 
	ACTION <- ServerEndPoint
	CompositeType <- Composite
	@enduml
	
![png/monitor/monitor.png](png/monitor/monitor.png)	

Ver documentação sobre [linguagem Swift neste link](https://developer.apple.com/library/ios/documentation/swift/conceptual/Swift_Programming_Language/TheBasics.html#//apple_ref/doc/uid/TP40014097-CH5-XID_454) 