let stompClient;

const connect = () => {
    const socket = new SockJS('/producer-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, () => {
        console.log('Connected to Producer WebSocket');
    });
};

const sendMessage = () => {
    const message = document.getElementById('message-input').value;
    if (!message) return;

    stompClient.send("/app/send", {}, message);
    document.getElementById('status').textContent = `Отправлено: "${message}"`;
    document.getElementById('message-input').value = '';
};

document.addEventListener('DOMContentLoaded', connect);