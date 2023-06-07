# MethodOverridingPractice


Overriding is a good example of Runtime polymorphism. Runtime polymorphism is also called dynamic binding. In the overriding concept,the child class
extends the Parent class. So, overriding means rewriting the parents functionality in the child class. Method signature is exactly the same in both Parent class 
and Child class, but the logics are different according to their requirments. Method signature means the method name,method data type,
  and the arguments/inputs.


The method in the Parent class is called overriden method.The method signature/functionality that is rewritten in the Child class is called 
overriding method.


We can prevent overriding by using the final keyword in the method.If we use the final keyword in a class you cannot extend that final class  Also, if we use the final keyword in a varible, no modifications are allowed for that varible. We cannot change the values.The values are fixed.

While overriding, the return method's data type must be the same with its return(varible) data type. The return methods take the inputs, process the
inputs and return the results to the caller. 

Overridden method and Overriding method data type must be eaxctly the same.


Note: When the method returns the values, it gives the returning data to the caller. The caller will store the result in a varible and that varible data
type should be the same with the return method's data type.

Benefits of Method Overriding:

1. We can reuse the code.

2. It makes the code more readable avoiding unused code. 

3. It helps to call the correct method at runtime.

