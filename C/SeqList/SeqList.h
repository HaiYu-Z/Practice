#pragma once
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>

typedef int SLDataType;
typedef struct SeqList
{
	SLDataType* a;
	int size;     // 有效数据的个数
	int capacity; // 容量
}SL;

//基本增删查改接口//顺序表初始化
void SeqListInit(SL* ps);
//顺序表销毁
void SeqListDestory(SL* ps);
//顺序表打印
void SeqListPrint(SL* ps);
//检查空间，如果满了，进行增容
void CheckCapacity(SL* ps);
//头插
void SeqListPushFront(SL* ps, SLDataType x);
//尾插
void SeqListPushBack(SL* ps, SLDataType x);
//头删
void SeqListPopFront(SL* ps);
//尾删
void SeqListPopBack(SL* ps);
//查找
int SeqListFind(SL* ps, SLDataType x);
//修改
void SeqListModity(SL* ps, int pos, SLDataType x);
//在pos位置插入x
void SeqListInsert(SL* ps, int pos, SLDataType x);
//删除pos位置的值
void SeqListErase(SL* ps, int pos);