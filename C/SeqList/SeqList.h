#pragma once
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>

typedef int SLDataType;
typedef struct SeqList
{
	SLDataType* a;
	int size;     // ��Ч���ݵĸ���
	int capacity; // ����
}SL;

//������ɾ��Ľӿ�//˳����ʼ��
void SeqListInit(SL* ps);
//˳�������
void SeqListDestory(SL* ps);
//˳����ӡ
void SeqListPrint(SL* ps);
//���ռ䣬������ˣ���������
void CheckCapacity(SL* ps);
//ͷ��
void SeqListPushFront(SL* ps, SLDataType x);
//β��
void SeqListPushBack(SL* ps, SLDataType x);
//ͷɾ
void SeqListPopFront(SL* ps);
//βɾ
void SeqListPopBack(SL* ps);
//����
int SeqListFind(SL* ps, SLDataType x);
//�޸�
void SeqListModity(SL* ps, int pos, SLDataType x);
//��posλ�ò���x
void SeqListInsert(SL* ps, int pos, SLDataType x);
//ɾ��posλ�õ�ֵ
void SeqListErase(SL* ps, int pos);