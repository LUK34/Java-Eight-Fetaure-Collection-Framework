package com.javaeight;

@FunctionalInterface
public interface AddInterface
{
	int add(int i, int j);
}

/*
1. If we have more than 1 method in the Interface. And we are trying to access that method using lambda expression
we will not be able to because of ambiguity. This is because the Lambda expression has no name to access the method
within the interface.

2. Lambda can written for an interface that takes only 1 abstract method.

3. So we use @FunctionalInterface. This annotation will restrict the developer to add more than one method in the interface.
Thus preventing ambiguity in lambda expression.

 */