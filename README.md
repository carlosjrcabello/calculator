#Calculator

Simplify your math ops with this simple DSL. Forget all ugly ways to make your daily calcs and use a _verbal way_.

###Commons comparisons

All methods has been based on *EL spec* to keep a natural usage on both.

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

If you need invert values, forget the classic ```Double arg = target * (-1)```....

```java
Double positive = Calculator.positivefy(val);
```
```java
Double positive = Calculator.negativefy(val);
```

### Base operations

You can abstract all base ops _(add, minus, divide and multiply)_ with simple verbs.
```java
Double result = Calculator.add(20D, 3); // will return 23.
```
```java
Double result = Calculator.minus(2D, 3D); // will return -1.
```
```java
Double result = Calculator.minus(2D, -3D); // will return 5.
// or
Double result = Calculator.minus(2D, Calculator.negativefy(3D)); // will return 5.
```
```java
Double result = Calculator.multiply(3D, 3D); // will return 9.
```
```java
Double result = Calculator.divide(4D, 2D); // will return 2.
```
### Extra base operations

All base operations have a _round_ arg to fix the decimal value ```0.XX```.

```java
Double result = Calculator.minus(2.93939D, 3D, 2); // will return -0.06.
```