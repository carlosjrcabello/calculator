#Calculator

Simplify your math ops with this simple DSL.

```java
// Ugly mode.
Double val = new Double(1234);

int compare = val.compareTo(target);

// aaahhhhhh!!!
```
###Commons comparisons

```java
if(Calculator.gt(val, target)){
	// is greater than.
}

if(Calculator.lt(val, target)){
	// is less than.
}

if(Calculator.ne(val, target)){
	// is not equals.
}
```