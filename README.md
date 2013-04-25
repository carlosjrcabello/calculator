#Calculator

Simplify your math ops with this simple DSL.

```java
// Ugly mode.
Double val = new Double(1234);

int compare = val.compareTo(target);

// aaahhhhhh!!!
```
###Commons comparisons

All methods has been based on EL spec to keep a natural usage on both.

```java
if(Calculator.gt(val, target)){
	// is greater than.
}
```
```java
if(Calculator.ge(val, target)){
	// is greater than or equals.
}
```
```java
if(Calculator.lt(val, target)){
	// is less than.
}
```
```java
if(Calculator.le(val, target)){
	// is less than or equals.
}
```
```java
if(Calculator.ne(val, target)){
	// is not equals.
}
```
```java
if(Calculator.eq(val, target)){
	// is equals.
}
```

### Extra comparisions
However, you can also check for other commons situations, like:

```java
if(Calculator.isPositive(val)){
	// is a positive number.
}
```
```java
if(Calculator.isNegative(val)){
	// is a negative number.
}
```
### Fast inversions

If you need invert values, forgot the classic ```Double arg = target * (-1)```....

```java
Double positive = Calculator.positivefy(val);
```
```java
Double positive = Calculator.negativefy(val);
```

### Base operations

You can abstract all base ops _(add, minus, divide and multiply)_ with simple verbs.

