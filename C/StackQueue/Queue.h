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

// ��β��
void QueuePush(Queue* pq, QDataType x);

// ��ͷ��
void QueuePop(Queue* pq);

// ȡ��ͷ����
QDataType QueueFront(Queue* pq);
// ȡ��β����
QDataType QueueBack(Queue* pq);

int QueueSize(Queue* pq);
bool QueueEmpty(Queue* ps);