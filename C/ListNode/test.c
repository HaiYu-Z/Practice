#define _CRT_SECURE_NO_WARNINGS
#include "List.h"

int main()
{
	ListNode* phead = ListInit();
	ListPushBack(phead, 1);
	ListPushBack(phead, 2);
	ListPushBack(phead, 3);
	ListPushBack(phead, 4);
	ListPrint(phead);

	ListPushFront(phead, 5);
	ListPushFront(phead, 6);
	ListPushFront(phead, 7);
	ListPrint(phead);

	ListPopBack(phead);
	ListPopBack(phead);
	ListPrint(phead);

	ListNode* pos = ListFind(phead, 6);
	ListInsert(pos, 60);
	ListPrint(phead);

	pos = ListFind(phead, 5);
	ListErase(pos);
	ListPrint(phead);

	ListDestory(phead);
	return 0;
}