# google-protocol-buffer

protoc.exe下载地址
https://github.com/google/protobuf/releases/tag/
protoc-3.5.0-win32.exe下载地址
https://github.com/google/protobuf/releases/tag/v3.5.0
protoc-2.6.1-win32.exe下载地址
https://github.com/google/protobuf/releases/tag/v2.6.1


protoc.exe是protobuf代码生成工具。

第一步：定义数据结构

首先要定义protobuf的数据结构，这里要写一个.proto文件。这个文件有点类似于定义一个类。例如定义一个Person，保存文件PersonMsg.proto（注意文件名和里面的message名不要一样）。

[plain] view plain copy
message Person {

    // ID（必需）
    required int32 id = 1;

    // 姓名（必需）
    required string name = 2;

    // email（可选）
    optional string email = 3;

    // 朋友（集合）
    repeated string friends = 4;
}

上面的1、2、3、4是unique numbered tag，是一个唯一标识。
上面的例子中定义了一个非常简单的数据结构，当然还可以定义更复杂的结构，这里不再讨论，具体可以看官方文档。

第二步：protoc.exe生成Java代码

使用文件protoc.exe，cmd命令行运行：

protoc.exe --java_out=E:\java PersonMsg.proto

输入文件是PersonMsg.proto，也就是定义数据结构的文件；输出文件夹是E:\java，将java文件生成在E:\java中。运行命令成功后会生成PersonMsg.java：