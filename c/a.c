/**
include 就是要告诉编译器，包含一个头文件。
#include <stdlib.h>  用于标准库文件或系统提供的头文件，到保存系统标准头文件的位置查找头文件。
而"#include "userdefined.h"用于用户自定义的头文件，
先从当前目录查找是否有指定名称的头文件，若当前目录未找到该头文件，再从标准文件目录中查找。
这两种方式有他们的本质区别。
在c语言程序设计中包含的头文件可分为系统标准头文件和用户工程中自定义的头文件，
对于系统标准库头文件可以用这两种方式进行包含，但是采用第一种方式更节省时间，
所以一般建议采用第一种方式。对于用户自己定义的头文件（保存在工程路径下）只能用第二种方式进行包含操作，
否则出错（当然也可以把自己定义的工程中需要的头文件放在标准头文件路径下，但是这违背常规操作）。
*/
#include <stdio.h> //
int main1()
{	
	int $aa;

	printf("hello world!\n");//printf是一个库函数，我们要用库。就要提前用#include告诉编译器
	printf("%s\n","printf是向标准设备进行格式化输出" );
	return 0;
}

#include <stdlib.h>
int main(int argc, char const *argv[])
{	
	//system函数就是来执行操作系统的命令
	//或者运行指定的程序
	int i ;
	i= system("b");
	printf("i = %x\n",i);
	return 0;
}