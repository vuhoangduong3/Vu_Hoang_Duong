#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef enum {
    INT, FLOAT, CHAR, STRING
} DataType;

// Cấu trúc của một node
typedef struct Node {
    void* data;         // Con trỏ void lưu trữ dữ liệu bất kỳ
    DataType type;      // Kiểu dữ liệu của node
    struct Node* next;  // Con trỏ trỏ đến node tiếp theo
} Node;
// Hàm tạo node mới
Node* createNode(void* data, DataType type) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->type = type;
    newNode->next = NULL;

    // Cấp phát bộ nhớ theo kiểu dữ liệu
    switch (type) {
        case INT:
            newNode->data = malloc(sizeof(int));
            *(int*)newNode->data = *(int*)data;
            break;
        case FLOAT:
            newNode->data = malloc(sizeof(float));
            *(float*)newNode->data = *(float*)data;
            break;
        case CHAR:
            newNode->data = malloc(sizeof(char));
            *(char*)newNode->data = *(char*)data;
            break;
        case STRING:
            newNode->data = malloc(strlen((char*)data) + 1);
            strcpy((char*)newNode->data, (char*)data);
            break;
    }
    return newNode;
}
// Hàm thêm một node vào đầu danh sách
void insertAtHead(Node** head, DataType type, void* data) {
    Node* newNode = createNode(type, data);
    newNode->next = *head;
    *head = newNode;
}
