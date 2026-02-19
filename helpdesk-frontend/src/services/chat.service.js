import axios from "axios"

const baseURL = 'http://localhost:8080/api/ai'


export const sendMessageToServer = async (messages, conversationId) => {

    const response = await axios.post(`${baseURL}/helpdesk`, messages, {
        headers: {
            conversationId: conversationId,
        },
    });
    return response.data;

}