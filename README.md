# Java Generics Type Capture Bug

Same syntax produces different semantics for different java versions.

Run with different java versions:

    ./runMinimal.sh
 
## Java <8

Cannot infer the type of the generic, latest version which does not support the source code.

## Java 9-12

Produces a `null` value which is unexpected.

## Java 13-15

Produces the expected value `A`.


# Less Minimal Gradle Setup

For a less minimal example, refer to the [Gradle Setup Commit](https://github.com/albsch/java_types_matrix/tree/23b02e7f4663e5ae45e29f8218d067151b8d4e90).
