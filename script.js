```javascript
document.getElementById("form").onsubmit = function() {

    let firstName = document.querySelector(
        'input[type="text"]'
    ).value;

    let phone = document.querySelector(
        'input[type="tel"]'
    ).value;

    let email = document.querySelector(
        'input[type="email"]'
    ).value;

    // Check name
    if (firstName == "") {
        alert("Please enter your first name");
        return false;
    }

    // Check phone number
    if (phone.length != 10) {
        alert("Phone number must contain 10 digits");
        return false;
    }

    // Check email
    if (email == "") {
        alert("Please enter your email");
        return false;
    }

    // Successful registration
    alert("Registration Successful!");
    return false;
};
```
