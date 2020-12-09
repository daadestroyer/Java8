# Java 8 New Concepts by - Shubham Nigam (daadestroyer)

# 1. Lambda Expression
-----------------------------------
1. Lambda expression is an anonymous function 
2. It is not having any name (nameless)
3. It is not having any modifiers
4. It is not having any arguemnts

// Before Java 8

<pre>
public void m1(){<br>
sop("Hello");
<br>}
</pre>

// In Java 8

<pre>
()->sop("Hello");
</pre>

// Before Java 8

<pre>
public void add(int a , int b){<br>
sop(a+b);<br>
}
</pre>

// In Java 8
<pre>
(int a , int b)-> sop(a+b);
or
(a,b)->sop(a+b);
</pre>
<br>
NOTE :- 
1. SOP's statement only can be written without braces also <br>
2. A lambda expression can have zero or more no of arguemnts <br>
3. Ususally we've to specify type of parameter , but in lambda expression there is no need to specify types also <br>
4. If zero no of paramter are there then we can use only brackets ()->sop("hello"); <br>
5. If lamda expression is containing more than one line then brackes are necessary <br>
       

# 2. Functional Interface
------------------------------------------
If a interface contain only one abstract method then that type of interface are called functional interface , and that method present inside functional 
interface is called single abstract method (SAM).

Runnalbe(I) it contains only run() method
Comparable(I) it contains only compareTo() method
Callable(I) it contains only call() method

all these are called functional interface and that method present inside that interface are called as single abstract method (SAM)


1. FunctionalInterface are made by using @FunctionalInteface annotations 
2. You can take any number of static , default private methods but you can take only one abstract method inside functional interface
3. If you're taking more than one abstract method then in that case it is treated as normal interface 
4. @FunctionalInterface is used to in functional inteface to indicate compiler we're using @FuntionalInterface
5. Advantage of using @FunctionalInterface is to indicate that it is FunctionalInterface 
6. It is compulsory to take one abstract method inside Functional Interface otherwise we will get CE : Unexpected @FunctionalInterface annotation no abstract method found

Eg:1

<pre>
@FunctionalInteface<br>
interface Interf{<br>
public void m1();<br>
static void m2(){<br>}<br>
default void m3(){<br>}<br>
}
</pre>

Eg:2
<pre>
@FunctionalInterface<br>
interface I{<br>
public void m1(){<br>

}
public void m2(){<br>

}
}
CE : Unexpected @FunctionalInterface annotation multiple non-overriding abstract method presentin interface I
</pre>


# 3. Functional Interface with respect to Inheritance
-------------------------------------------------------------
Case : 1 <br>
If a child functional interface extends parent interface and child interface doesn't contain any abstract methods then that child interface in that case also calles as Functional Interface

<pre>
interface P{<br>
public void m1();<br>
}<br>
interface C extends P{<br>

}

// in this case also interface C is also called as Functional Interface 
</pre>

Case : 2 <br>
If a child functional interface we can define exactly same parent functional interface 

<pre>
interface P{<br>
public void m1();<br>
}<br>
interface C extends P{<br>
public void m1();<br>
}

// in this case also interface C is also called as Functional Interface 
</pre>

Case : 3 <br>
If a child functional interface we can't define any new functional interface otherwise we will get CE

<pre>
interface P{<br>
public void m1();<br>
}<br>
interface C extends P{<br>
public void m2();<br>
}

// in this case we will get CE  
</pre>

Case : 4 <br>
If a child interface is extending parent functional interface in that child interface contain 1 parent give and 1 its own method then in that case child interface have 2 abstract method but it is 
valid because we didn't declare child interface as functional interface hence it is treated as normal interface

<pre>
interface P{<br>
public void m1();<br>
}<br>
interface C extends P{<br>
public void m1();<br>
public void m2();<br>

}

// in this case also interface C is treated as normal interface 
</pre>