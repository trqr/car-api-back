import {createBrowserRouter} from "react-router-dom";
import Home from "./pages/Home";
import {getMakers} from "./services/makerService.ts";
import {getAllCars, getMakerCars} from "./services/carService.ts";
import MakerPage from "./pages/MakerPage.tsx";

export const router = createBrowserRouter([
    {
        path: "/",
        element: <Home/>,
        loader: () => getMakers()
    },
    {
        path: "/carmodels/:makerId",
        element: <MakerPage/>,
        loader: ({params: {makerId}}) => getMakerCars(makerId!)
    },
    {
        path: "/carmodels",
        element: <MakerPage/>,
        loader: () => getAllCars()
    }
])