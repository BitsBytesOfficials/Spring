# Spring Farmework Bot
	1.Setup  JDK
	2. Create Java Project
	3. add spring jar files
	4.  Create Source Files
	5. Bean Configuration File
	6.Main Class [Run the Program]
	
## IOC 
> 1. It is a container its responsible for configure and Assemble the Objects
> 2. Its gets the information from the XML file and work according.
 It can create using 2 ways
 1. ApplicationContext Container
 2. BeanFactory Container

## ApplicationContext
 ApplicationContext container includes all functionality of the BeanFactorycontainer, so it is generally recommended over BeanFactory. BeanFactory can still be used for lightweight applications like mobile devices or applet-based applications where data volume and speed is significant.
 
	### ClassPathXmlApplicationContext(xmlfile)
	### 


## Dependency Injection  type and Description
1. **Constructor-based dependency Injection**
		Constructor-based DI is accomplished when the container invokes a class constructor with a number of arguments, each representing a dependency on the other class.
2. **Setter-based dependency Injection**
		Setter-based DI is accomplished by the container calling setter methods on your beans after invoking a no-argument constructor or no-argument static factory method to instantiate your bean.
		
		
#### After Lunch
> **1. BOOK,Chapter**,Title class created 

> **2. Book.xml Created** in which we create 
>> ** beans of Title**: Title Class having 
		
>> **beans of Chapter** Chapter class having 

 	[
		
+		 private int number;
		
+		private Title title; { <property name-"title">
			*<ref bean="bean name"/>* </ property>}
+			private String content;
	]
>> **1 bean of Book**:  
 
  
