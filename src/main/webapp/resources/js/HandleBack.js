function HandleBackFunctionality()
{
    if(window.event) //Internet Explorer
    {
           alert("Browser back button is clicked on Internet Explorer...");
    }
    else //Other browsers e.g. Chrome
    {
           alert("Browser back button is clicked on other browser...");
    }
}