import {Box, Button, Card, CardContent, CardMedia, Container, Grid, Typography} from "@mui/material";
import type {Maker} from "../../../models/Maker.ts";

type BrandListProps = {
    makers: Maker[];
}

const MakersList = ({makers}:BrandListProps) => {
    return (
        <>
            <Container>
                <Grid container spacing={1}>
                    {makers.map((maker: Maker, index: number) => (
                        <Grid key={index} size={{xs: 12, sm: 6, md: 6, lg: 4, xl: 4}}>
                            <Card sx={{display: 'flex', justifyContent: "space-between", padding: "10px", minHeight: "171px"}}>
                                <Box sx={{display: 'flex', flexDirection: 'column'}}>
                                    <CardContent sx={{flex: '1 0 auto'}}>
                                        <Typography component="div" variant="h5">
                                            {maker.name}
                                        </Typography>
                                        <Typography
                                            variant="subtitle1"
                                            component="div"
                                            sx={{color: 'text.secondary'}}
                                        >
                                            <img style={{width: "23px"}} src={maker.countryFlagPath}/>  {maker.country}
                                        </Typography>
                                    </CardContent>
                                    <Box sx={{display: 'flex', alignItems: 'center', pl: 1, pb: 1}}>
                                        <Button>View Cars</Button>
                                    </Box>
                                </Box>
                                <CardMedia
                                    component="img"
                                    sx={{width: 151, objectFit: 'contain'}}
                                    image={maker.logoPath}
                                    alt={maker.name}
                                />
                            </Card>
                        </Grid>
                    ))}
                </Grid>
            </Container>
        </>
    )
}

export default MakersList;