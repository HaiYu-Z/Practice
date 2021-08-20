#pragma once
#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include <stdbool.h>

typedef int STDataType;

typedef struct Stack
{
	STDataType* a;
	int top;
	int capacity;
}Stack;

void StackInit(Stack* ps);
void StackDestory(Stack* ps);

//栈顶插入数据
//入栈
void StackPush(Stack* ps, STDataType x);
//出栈
void StackPop(Stack* ps);

//取栈顶数据
STDataType StackTop(Stack* ps);

int StackSize(Stack* ps);
bool StackEmpty(Stack* ps);
