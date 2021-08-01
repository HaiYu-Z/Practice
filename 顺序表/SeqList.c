#define _CRT_SECURE_NO_WARNINGS
#include "SeqList.h"

void SeqListInit(SL* ps)
{
	ps->a = NULL;
	ps->size = 0;
	ps->capacity = 0;
}

//˳�������
void SeqListDestory(SL* ps)
{
	free(ps->a);
	ps->a = NULL;
	ps->capacity = ps->size = 0;
}

//˳����ӡ
void SeqListPrint(SL* ps)
{
	for (int i = 0; i < ps->size; i++)
	{
		printf("%d ", ps->a[i]);
	}
	printf("\n");
}

//���ռ䣬������ˣ���������
void CheckCapacity(SL* ps)
{
	if (ps->size == ps->capacity)
	{
		int newcapacity = ps->capacity == 0 ? 10 : ps->capacity * 2;
		SLDataType* tmp = (SLDataType*)realloc(ps->a, newcapacity * sizeof(SLDataType));
		if (tmp == NULL)
		{
			perror("CheckCapacity\n");
			exit(-1);
		}
		else
		{
			ps->a = tmp;
			ps->capacity = newcapacity;
		}
	}
}

//ͷ��
void SeqListPushFront(SL* ps, SLDataType x)
{
	//CheckCapacity(ps);
	//int end = ps->size - 1;
	//while (end >= 0)
	//{
	//	ps->a[end + 1] = ps->a[end];
	//	end--;
	//}
	//ps->a[0] = x;
	//ps->size++;

	SeqListInsert(ps, 0, x);
}

//β��
void SeqListPushBack(SL* ps, SLDataType x)
{
	//CheckCapacity(ps);
	//ps->a[ps->size] = x;
	//ps->size++;

	SeqListInsert(ps, ps->size, x);
}

//ͷɾ
void SeqListPopFront(SL* ps)
{
	//int head = 1;
	//while (head < ps->size)
	//{
	//	ps->a[head - 1] = ps->a[head];
	//	head++;
	//}
	//ps->size--;

	SeqListErase(ps, 0);
}

//βɾ
void SeqListPopBack(SL* ps)
{
	ps->size--;
}

//����
int SeqListFind(SL* ps, SLDataType x)
{
	for (int i = 0; i < ps->size; ++i)
	{
		if (ps->a[i] == x)
		{
			return i;
		}
	}

	return -1;
}

//�޸�
void SeqListModity(SL* ps, int pos, SLDataType x)
{
	assert(pos < ps->size);
	ps->a[pos] = x;
}

//��posλ�ò���x
void SeqListInsert(SL* ps, int pos, SLDataType x)
{
	assert(pos <= ps->size);
	CheckCapacity(ps);

	int end = ps->size;
	while (end > pos)
	{
		ps->a[end] = ps->a[end - 1];
		end--;
	}
	ps->a[pos] = x;
	ps->size++;
}

//ɾ��posλ�õ�ֵ
void SeqListErase(SL* ps, int pos)
{
	assert(pos <= ps->size);
	CheckCapacity(ps);

	while (pos < ps->size - 1)
	{
		ps->a[pos] = ps->a[pos + 1];
		pos++;
	}
	ps->size--;
}