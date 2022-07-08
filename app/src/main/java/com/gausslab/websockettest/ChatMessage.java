package com.gausslab.websockettest;

public class ChatMessage {

    private final String senderName;
    private final long sendTimestamp;
    private final String messageContent;

    public ChatMessage(String senderName, String messageContent) {
        this.senderName = senderName;
        this.messageContent = messageContent;
        sendTimestamp = System.currentTimeMillis();
    }

    public String getSenderName() {
        return senderName;
    }

    public long getSendTimestamp() {
        return sendTimestamp;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
