# Collection Framework-Projects
CoreJava projects based on Collection Framework

There are 4 different Applications.

1)
***NameList.java*** - Created ArrayList and populated them using arraylistvariable.add() and then called predefined methods from Collection interface on it.

2)
***Basket.java*** - Class with Private Data Members - generated Constructor, Getters & Setters, and toString.
***BasketMain.java*** -Used Type Specific ArrayList<Basket> to only store Basket objects. Used STREAM() in methods and TypeCasted List to ArrayList. 
  
3)  
***Citizen.java & Address.java*** - Classes with Private Data Members - generated Constructor, Getters & Setters, and toString.
***CitizenAddressApplication.java*** - Created HashMap<Long,Citizen> - <Key,Value> pairs - Key is Aadhar Number of Long type amd Value is of Citizen Objects
                                 Populated the HashMap using hashmapvariable.put(key,value)
                                 Used methods like hashmapvariable.keyset to get only KEYS
                                                   hashmapvariable.values to get only VALUES to then perform necessary actions in the STREAM()
  
4)
***Country.java*** - Class with Private Data Members - generated Constructor, Getters & Setters, and toString
***Municipality.java*** - Main Class - Used Entry<String,Integer> (<K,V>) - Similar to HashMap but better used to work with Key & Value pairs combined.
 
