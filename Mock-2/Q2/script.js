
    function validateForm() {
      var name = document.forms["myForm"]["name"].value;
      var email = document.forms["myForm"]["email"].value;
      var phone = document.forms["myForm"]["phone"].value;
      var password = document.forms["myForm"]["password"].value;
      var age = document.forms["myForm"]["age"].value;
      var gender = document.forms["myForm"]["gender"].value;
      var date = document.forms["myForm"]["date"].value;
      var color = document.forms["myForm"]["color"].value;

      if (name == "") {
        alert("Name must be filled out");
        return false;
      }

      if (email == "") {
        alert("Email must be filled out");
        return false;
      }

      // Basic email validation
      var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      if (!emailRegex.test(email)) {
        alert("Invalid email address");
        return false;
      }

      if (phone == "") {
        alert("Phone number must be filled out");
        return false;
      }

      // Basic phone number validation
      var phoneRegex = /^\d{10}$/;
      if (!phoneRegex.test(phone)) {
        alert("Invalid phone number");
        return false;
      }

      if (password == "") {
        alert("Password must be filled out");
        return false;
      }

      if (age == "") {
        alert("Age must be filled out");
        return false;
      }

      // Basic age validation
      var ageRegex = /^\d+$/;
      if (!ageRegex.test(age)) {
        alert("Invalid age");
        return false;
      }

      if (gender == "") {
        alert("Gender must be selected");
        return false;
      }

      if (date == "") {
        alert("Date must be filled out");
        return false;
      }

      if (color == "") {
        alert("Color must be selected");
        return false;
      }

      return true;
    }
  