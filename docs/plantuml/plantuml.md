# Monitor do SOMA

O PlantUML permite definir diagramas UML facilmente. Veja este exempo abaixo:

	@startuml
	class Car
	Driver - Car : drives >
	Car *- Wheel : have 4 >
	Car -- Person : < owns	
	@enduml
	
O diagrama gerado aparece abaixo:

![png/cars.png](png/cars.png)	

