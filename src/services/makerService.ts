import {api} from "./api.ts";

export const getMakers = async () => {
    return await api.get("/makers").then(res => res.data)
}