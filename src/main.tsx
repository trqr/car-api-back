import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.tsx'
import {CssBaseline, ThemeProvider} from "@mui/material";
import {theme} from "./Theme.tsx";

createRoot(document.getElementById('root')!).render(
  <StrictMode>
      <ThemeProvider theme={theme}>
        <CssBaseline/>
        <App />
      </ThemeProvider>
  </StrictMode>,
)
