import {useLoaderData, useRevalidator} from "react-router-dom";
import {Paper} from "@mui/material";
import {useEffect, useState} from "react";
import {DataGrid, type GridColDef} from '@mui/x-data-grid';
import dayjs from "dayjs";


const MakerPage = () => {
    const cars = useLoaderData();
    const {revalidate} = useRevalidator();
    const [selectedRows, setSelectedRows] = useState<number[]>([])

    const handleSelectionChange = (newSelection: any) => {
        const ids: never[] = Array.from(newSelection.ids)
        setSelectedRows(ids);
    }

    useEffect(() => {
        console.log(cars)
    }, [cars])

    const columns: GridColDef[] = [
        {field: 'id', headerName: 'ID', width: 70},
        {
            field: 'model',
            headerName: 'Model',
            width: 250,
        },
        {
            field: 'price',
            headerName: 'Price',
            width: 140,
            renderCell: (params) => params.value + " €"
        },
        {
            field: 'releaseDate',
            headerName: 'Release Date',
            width: 160,
            renderCell: (params) => dayjs(params.value).format('MMMM - YYYY')
        },
    ];

    const paginationModel = {page: 0, pageSize: 20};
    return (
        <>
                    <Paper sx={{height: 600, width: '100%'}}>
                        <DataGrid

                        rows={cars}
                        columns={columns}
                        initialState={{pagination: {paginationModel}}}
                        pageSizeOptions={[5, 10]}
                        checkboxSelection
                        onRowSelectionModelChange={handleSelectionChange}
                        sx={{border: 0}}
                    />
                    </Paper>
        </>
    )
}

export default MakerPage;