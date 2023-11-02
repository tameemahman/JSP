<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Add Student</h1>
    </div>
    <!--    start form-->
    <form action="addStudent.jsp"  method="post">
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">First Name</label>
                <input type="text" class="form-control" id="givenName" name="givenName" placeholder="First Name">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Subject</label>
                <select class="form-select" name="subject" aria-label="Default select example">
                    <option selected>Select Anyone</option>
                    <option value="JEE">JEE</option>
                    <option value="NT">NT</option>
                    <option value="DDD">DDD</option>
                    <option value="GAVE">GAVE</option>
                </select>
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Gender</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Male" name="gender" id="flexRadioDefault1">
                    <label class="form-check-label" for="flexRadioDefault1">
                        Male
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Female" name="gender" id="flexRadioDefault2" >
                    <label class="form-check-label" >
                        Female
                    </label>
                </div>
            </div>        
        </div>

        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Save</button>

            </div>
            
             <div class="col-md-6">
                 <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        </div>
    </form>

    <!--end form    -->
</div>



<%@include file="footer.jsp" %>
