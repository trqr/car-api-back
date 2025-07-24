import FlowingMenu from "../common/components/FlowingMenu/FlowingMenu.tsx";
import {useEffect, useState} from "react";
import MakersList from "../common/components/MakersList/MakersList.tsx";
import {Container} from "@mui/material";
import {useLoaderData} from "react-router-dom";
import TextType from "../common/components/TextType/TextType.tsx";

type flowingMenuType = {
    link: string;
    text: string;
    image: string;
}

type InfiniteMenuType = {
    image: string;
    link: string;
    title: string;
    description: string;
}


const Home = () => {
    const carBrands = useLoaderData();
    const [flowingMenuItems, setFlowingMenuItems] = useState<flowingMenuType[]>([]);
    const [infiniteMenuItems, setInfiniteMenuItems] = useState<InfiniteMenuType[]>([])


    useEffect(() => {
        const items: flowingMenuType[] = carBrands.map((brand) => ({
            link: `/cars/${brand.id}`,
            text: brand.name,
            image: brand.logoPath
        }));

        const infiItems: InfiniteMenuType[] = carBrands.map(brand => ({
            image: brand.logoPath,
            link: `/brands/${brand.name.toLowerCase()}`,
            title: brand.name,
            description: brand.country
        }));
        console.log(carBrands);
        setFlowingMenuItems(items);
        setInfiniteMenuItems(infiItems);
    }, []);

    return (
        <>
            <Container>
                <TextType
                    style={{
                        display: "block",
                        margin: "30px auto",
                        textAlign: "center",
                        width: "fit-content"
                    }}                    text={["Welcome to the future...", "Look how cool this is!", "It's amaaaazzzzinnnnnnnnnng !"]}
                    typingSpeed={75}
                    as={"h1"}
                    textColors={["#71adfd", "#9699ec","#6857f3"]}
                    ></TextType>
                <FlowingMenu items={flowingMenuItems}></FlowingMenu>
                <MakersList makers={carBrands}></MakersList>
            </Container>
        </>
    )
}

export default Home;