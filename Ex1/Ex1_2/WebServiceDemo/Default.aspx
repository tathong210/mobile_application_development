<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div style="color: #FF3399">
    
        <asp:Label ID="Label1" runat="server" Text="Web Service Demo"></asp:Label>
    
    </div>
    <p>
        <asp:Label ID="Label3" runat="server" Text="Lattitude 1"></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server" style="margin-left: 30px"></asp:TextBox>
    </p>
    <asp:Label ID="Label4" runat="server" Text="Longtitude 1"></asp:Label>
    <asp:TextBox ID="TextBox2" runat="server" style="margin-left: 19px"></asp:TextBox>
    <p>
        &nbsp;</p>
    <asp:Label ID="Label5" runat="server" Text="Latitude 2"></asp:Label>
    <asp:TextBox ID="TextBox3" runat="server" style="margin-left: 35px"></asp:TextBox>
    <p>
        <asp:Label ID="Label6" runat="server" Text="Longtitude 2"></asp:Label>
        <asp:TextBox ID="TextBox4" runat="server" style="margin-left: 20px"></asp:TextBox>
    </p>
    <p>
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            Text="Distance" />
        <asp:TextBox ID="TextBox5" runat="server" Enabled="False" 
            style="margin-left: 19px" Width="119px"></asp:TextBox>
        <asp:Label ID="Label7" runat="server" Text="Km"></asp:Label>
    </p>
    </form>
</body>
</html>
