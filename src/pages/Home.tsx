import FlowingMenu from "../common/components/FlowingMenu/FlowingMenu.tsx";
import {useEffect, useState} from "react";
import MakersList from "../common/components/MakersList/MakersList.tsx";
import {Container} from "@mui/material";
import {useLoaderData} from "react-router-dom";
import TextType from "../common/components/TextType/TextType.tsx";
import InfiniteMenu from "../common/components/InfiniteMenu/InfiniteMenu.tsx";

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


const itemstest = [
    {
        image: 'https://picsum.photos/300/300?grayscale',
        link: 'https://google.com/',
        title: 'Item 1',
        description: 'This is pretty cool, right?'
    },
    {
        image: 'https://picsum.photos/400/400?grayscale',
        link: 'https://google.com/',
        title: 'Item 2',
        description: 'This is pretty cool, right?'
    },
    {
        image: 'https://picsum.photos/500/500?grayscale',
        link: 'https://google.com/',
        title: 'Item 3',
        description: 'This is pretty cool, right?'
    },
    {
        image: 'https://picsum.photos/600/600?grayscale',
        link: 'https://google.com/',
        title: 'Item 4',
        description: 'This is pretty cool, right?'
    }
];

const Home = () => {
    const carBrands = useLoaderData();
    const [flowingMenuItems, setFlowingMenuItems] = useState<flowingMenuType[]>([]);
    const [infiniteMenuItems, setInfiniteMenuItems] = useState<InfiniteMenuType[]>([])


    useEffect(() => {
        const items: flowingMenuType[] = carBrands.map((brand) => ({
            link: `/carmodels/${brand.id}`,
            text: brand.name,
            image: brand.logoPath
        }));

        const infiItems: InfiniteMenuType[] = carBrands.slice(0,8).map(brand => ({
            image: brand.logoPath,
            link: `carmodels/${brand.id}`,
            title: brand.name,
            description: brand.country
        }));
        console.log(infiItems);
        setFlowingMenuItems(items);
        setInfiniteMenuItems(infiItems);
    }, []);

    return (
        <>
            <Container>
                <InfiniteMenu items={infiniteMenuItems}></InfiniteMenu>
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