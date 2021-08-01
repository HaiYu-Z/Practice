#define _CRT_SECURE_NO_WARNINGS
#include "SeqList.h"

int main()
{
	SL s;
	SeqListInit(&s);
	SeqListPushBack(&s, 1);
	SeqListPushBack(&s, 2);
	SeqListPushBack(&s, 3);
	SeqListPrint(&s);

	SeqListPushFront(&s, 1);
	SeqListPushFront(&s, 2);
	SeqListPushFront(&s, 3);
	SeqListPrint(&s);

	
	SeqListPopBack(&s);
	SeqListPopBack(&s);
	SeqListPrint(&s);

	SeqListInsert(&s, 1, 5);
	SeqListPrint(&s);

	SeqListErase(&s, 1);
	SeqListPrint(&s);
	SeqListErase(&s, 0);
	SeqListPrint(&s);
	SeqListErase(&s, 1);
	SeqListPrint(&s);
	SeqListInsert(&s, 1, 5);
	SeqListPrint(&s);
	SeqListErase(&s, 1);
	SeqListPrint(&s);
	SeqListModity(&s, 1, 5);
	SeqListPrint(&s);

	SeqListDestory(&s);

	return 0;
}