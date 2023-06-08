go to chatting->src->Main->run the Run java file

As a prototype model, you can send only few message from server side and after that it refreshes itself.

You can send as many messages from client side but since the message panel which is storing message is static so
after it crosses the panel, message can't be seen.

Threading method is used, so when you send the first message from one side you need to trigger the other side by sending
message(it happens in only first message).

Try catch block is used in server-socket programming so chances of error are possible.