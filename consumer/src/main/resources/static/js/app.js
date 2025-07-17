const connectWebSocket = () => {
    const socket = new SockJS('/websocket');
    const stompClient = Stomp.over(socket);

    stompClient.connect({}, () => {
        console.log('Connected to WebSocket');
        stompClient.subscribe('/topic/messages', (message) => {
            const msgElement = document.createElement('div');
            msgElement.textContent = message.body;
            document.getElementById('messages').appendChild(msgElement);
        });
    });
};

document.addEventListener('DOMContentLoaded', connectWebSocket);