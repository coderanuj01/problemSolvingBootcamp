import { createTheme } from "@mui/material/styles";

const theme = createTheme({
  typography: {
    h1: {
      fontSize: "36px",
      lineHeight: "45px",
      margin: "0px",
      padding: "0px",
    },
    h3: {
      fontSize: "24px",
      lineHeight: "45px",
      margin: "0px",
      padding: "0px",
    },
    body1: {
      fontSize: "16px",
      lineHeight: "45px",
      margin: "0px",
      padding: "0px",
    },
    body2: {
      fontSize: "16px",
      lineHeight: "45px",
      margin: "0px",
      padding: "0px",
    },
  },
  components: {
    MuiTab: {
      styleOverrides: {
        root: {
          textTransform: "capitalize",
          placeItems: "flex-start",

          fontSize: "18px",
          lineHeight: "23px",
        },
      },
    },
  },
  palette: {
    primary: {
      main: "#2CE080",
    },
  },
});

export default theme;
