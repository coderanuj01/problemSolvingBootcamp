import React from "react";
import CSS from "csstype";

const footStyles: CSS.Properties = {
  height: "41px",
  width: "100vw",
  backgroundColor: "black",
  position: "fixed",
  bottom: 0,
};

const footText = {
  color: "white",
  marginTop: "10px",
};

function Footer() {
  return (
    <div style={footStyles}>
      <p style={footText}>@2021 Delhi India. All Right Reserved.</p>
    </div>
  );
}

export default Footer;
