import axios from "axios";

const baseURL = "/api/ai";

export const sendMessageToServer = async (
      messages,
      conversationId
    ) => {
          const response = await axios.post(
            `${baseURL}/helpdesk`,
            messages,
            {
              headers: {
                conversationId,
              },
            }
         );

      return response.data;
};