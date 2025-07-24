import {api} from "./api.ts";

export const getAllCars = async () => {
    return await api.get(`/carmodels/all`).then(res => res.data)
}

export const getMakerCars = async (makerId: string) => {
    return await api.get(`/carmodels/${makerId}`).then(res => res.data)
}