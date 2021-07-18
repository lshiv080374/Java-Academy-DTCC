# Assignment 2 - Back To The Basics

# Section 1

## Section 1a - Variables (Primitive Data Types)

There are a few `primitive data types` we would like for
you to get familiar with:

<b> Section Instructions: </b>


We would like you to create and assignment variables for
each of the eight primitive data types in Java (within PrimitiveDataTypes.java).

```
boolean, byte, char, short, int, long, float, double
```

After you have created your eight values, lets learn how to `cast` types.

- Cast your `int` type into a new variable of `type double`
- Multiply your `float` and original `double` type variable and store the result in a `float`
- Perform the same steps as the last bullet, but store the value in an `int` instead, and note the result
- Declare a new `char` variable, cast it to an `int` and print the result

### Course Discussion Activity
Lastly, select <b>one</b> of the types for a class discussion where you'll come with
a use case.

For example, "I am Bob the Builder and I selected a double data type to discuss.
I think that a `double` would be great to represent money or currency, as it contains decimals."

Additionally, please review the operators resource below.
<b> Resources:</b>

- [Primitive Data Types](https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types#:~:text=Primitive%20types%20are%20the%20most,simple%20values%20of%20a%20kind.)
- [Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
## Section 1b - Variables (Reference Types)

Reference types within Java may include, `classes, arrays or annotations` among other
[constructs](https://www.oreilly.com/library/view/java-8-pocket/9781491901083/ch04.html).

Please read this [link](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html), 
this will give you background on the `root` object of Java, the `Object` class.

<b> Section Instructions: </b>

We would like you to experiment with the primitive data types you learned
about in the previous section (within PrimitiveDataTypes.java).

There's already a declaration for an `Integer` type and `int` type, please
feel free to start there.

- See if those values are `equavalent`
- Debug the code to see how the values are stored
- Check the `boxed` types' classes to understand what API(s) are exposed

After this we'll get into how to do basic arithmetic


## Section 1c - Basic Arithmetic 

<b>Section Instructions</b>:

In this section your goal is to ensure that all of the `functions` in the
class `BasicArithmetic` resolve to true.

Where you start:
```text
Addition Asserts Correctly: false
Subtraction Asserts Correctly: false
Multiplication Asserts Correctly: false
Division Asserts Correctly: false
Remainder Asserts Correctly: false
``` 

Where you want to end up
```text
Addition Asserts Correctly: true
Subtraction Asserts Correctly: true
Multiplication Asserts Correctly: true
Division Asserts Correctly: true
Remainder Asserts Correctly: true
``` 

## Section 1d - Booleans & Compound Statements

A `boolean` is a value that can either be `true` or `false`. 

An assignment statement for a boolean type may look like:

```java
boolean myBool = true;
```

An assignment statement for a boolean may also look like:
```java
boolean myBool = 3 > 2;
```
<b> Section Instructions </b>

Please review `BooleansCompoundsExamples.java` and experiment yourself
with more complex variable assignment.


# Section 2

## Section 2a - Conditional Statements (Control Flow)

Within Java there are constructs that allow us to
[conditionally execute a piece of functionality](https://en.wikibooks.org/wiki/Java_Programming/Conditional_blocks).

For conditional statements to "fire" the condition specified, must
be satisfied.

Please review this pseudocode:

``` text
int i = 0;

if( i >= 0  ) {
    print(i);
} else {
    print("Condition not satisfied");
}
```

What would happen in the above code snippet?

<i>If you said 0 would be printed, you are correct, as i is 0 and
0 is greater than or equal to 0</i>.

Additionally, if you haven't already, you may notice from the previous section 
about compound assignments that the statement `i >= 0` resloves to a `boolean` type,
yielding either `true` or `false`.

<b> Section Instructions </b>

Please modify `ConditionalStatement1.java` to create a statement with the 
`int` `variable` `value` that will resolve to `true` within the `if statement's`
`conditional` parameter.

If have edited and ran the code correctly you'll notice that, <b>you've won! </b>


## Section 2b - Conditional Statements (Nested Control Flow)

Now that you have the basics of an `if/else statement`, let's `nest` the
statements to create more complex and powerful control flow mechanisms.

<b> Section Instructions </b>

Please modify `ConditionalStatement2.java` to replace the outer
`if statement's` true value, with what you did in section 2a. 

The goal of this is to win still, however we want you to notice
the hierarchy of if statements.

When you win there, please uncomment the function `doSomething`
and pass a true or false value into it.

The goal here is to notice what executes and what doesn't.

Additionally, you may notice operators from logic!

Specifically:

- && (and)
- || (or)
- ! (negation)

We'll speak a bit more on these in a bit, no worries.

## Section 2c - Logical Operators

**Logical And** aka `a conjunction`, aka when you combine statements
with `&&` the statement on the left and right side of the operator
must both resolve to true for the entire statement to be true.

**Logical Or** aka `a disjunction`, aka when you combine statements
with `||` at least one of the statements, combined by the operator must
be true for the entire statement to be true.

**Real World Examples**:

```
&&

I only want to buy these shoes, if they
are Nike branded and if they are the color red.
```

```
||

I want to buy these shoes, if they are Nikes or if they are red
```

For the first example, the shoes have to be both Nike and red, an
all or nothing statement.

For the second example, the shoes have to be either Nike or red,
this is a bit more flexible, in that you can get non-Nike red shoes or
any Nike shoe.

Let's take the following pseudocode:

```
int i = 0;

if( i > -1 && i < 1) {
    print("The cow goes moo")
}

if( i> -1 || i == 0) {
    print("The dog goes bark")
}

```

What do you think will happen?

*Both the cow will moo, and the dog will bark!* (If you had trouble here, no worries!)

<b> Section Instructions </b>

Review the truth tables for conjunctions and disjunctions (&& and ||):

[Note, that you will have to use `logical operators` instead of Java, to
generate the truth tables with this tool](https://web.stanford.edu/class/cs103/tools/truth-table-tool/).

To Generate The Truth Table;

```
p and q
p or q
```

Please take some time to review and understand the various states
of the truth table, you can also experiment with more variables
beyond p and q.

A snippet of an example of `a and b and c and d and e ...`

![](resources/truth_table_example.png?raw=false)


Please remember that `p` and `q` are variables that can take on
the boolean values of true or false. 

How those variables become
true or false can be simple direct assignment `boolean p = true;` or
something a lot more complex `boolean p = 2 * 10 > 0 && 0 != 1;`

At the end of the day, however you create a `boolean` it will eventually
become `true` or `false`, as long as you keep that in mind you'll be fine!

## Section 2d - Variable Scope

We're going to end this section talking about variable scope.

Now that we've introduced nested conditional blocks, let's
talk about how that will affect the lifecycle of variables.

Braces `{}` determine the scope and lifecycle of a variable:

```
{
    int i = 0;
}
```

The `variable` `i` is defined in the "root" scope in the example above
and is "globally" accessible.

```
{
    {
    int i = 0;
    }   
    print (i)
}
```

The `variable` `i` is defined in a "smaller" scope than our `print` statement,
therefore `i` "does" not exist there.

Let's play around with this:

<b> Section Instructions </b>

Please review `VariableScope.java` and answer both questions (this is within
D2L);

# Section 2e - Conditional Statements (Switch)

In addition to `if/else` statements you can also
use the [`switch` statement](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html) to control the flow of your program. 

Let's take a look at the example from the link above:

```
int month = 8;
String monthString;
switch (month) {
    case 1:  monthString = "January";
             break;
    case 2:  monthString = "February";
             break;
    case 3:  monthString = "March";
             break;
    case 4:  monthString = "April";
             break;
    case 5:  monthString = "May";
             break;
    case 6:  monthString = "June";
             break;
    case 7:  monthString = "July";
             break;
    case 8:  monthString = "August";
             break;
    case 9:  monthString = "September";
             break;
    case 10: monthString = "October";
             break;
    case 11: monthString = "November";
             break;
    case 12: monthString = "December";
             break;
    default: monthString = "Invalid month";
             break;
}
```

The `variable` *month* serves as a parameter that is passed
into the `switch` statements. 

**Pro Tip** we haven't talked about the keywords `break` and `continue` yet
in the context of a `switch` statement, think of `break` as "ending" the
"chain" of conditions. 

If `break` was not there, other `case` statements
would be evaluated.


Think of the flow as:

```
if month is 1
    do this...
    finish
if month is 2
    do that...
    finish
```

In the case of this example, the `variable` *monthString* would be
assigned the value of **"August"**, because `8 == 8`.

**Pro Tip** `case 8 == (if month == 8)`, `case {{match criteria}}`

# Section 3 - Looping, Break, and Continue

We're going to end this assignment introducing the concepts
of [loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html). 


Please review the link above and answer the questions for this section (this
is within D2L).


