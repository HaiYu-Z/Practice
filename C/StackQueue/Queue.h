#pragma once
#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include <stdbool.h>

typedef int QDataType;

typedef struct QueueNode
{
	struct QueueNode* next;
	QDataType data;
}QNode;

typedef struct Queue
{
	QNode* head;
	QNode* tail;
}Queue;

void QueueInit(Queue* pq);
void QueueDestory(Queue* pq);

// 队尾入
void QueuePush(Queue* pq, QDataType x);

// 对头出
void QueuePop(Queue* pq);

// 取队头数据
QDataType QueueFront(Queue* pq);
// 取队尾数据
QDataType QueueBack(Queue* pq);

int QueueSize(Queue* pq);
bool QueueEmpty(Queue* ps);
