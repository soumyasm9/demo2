<h6>step1</h6>
<p>First we should create Ec2 instance and will assign ssh,tcp,http to securitygroup</p>

<h6>step2</h6>
<p>Then we wiil connect that instance </p>

<h6>step2</h6>
<p>We should install maven,git,jenkins and docker on Ec2 instance</p>

<h6>step2</h6>
<p>Next we will open jenkins with publicDns on port 8080</p>

<h6>step2</h6>
<p>We will get the jenkins password by using sudo cat /var/lib/jenkins/secrets/initialAdminPassword</p>

<h6>step2</h6>
<p>Then we will provide username and password to the jenkins file. Next will enter into jenkins dashboard</p>


<h6>step2</h6>
<p>In jenkins will create a build step while creating build will enter git url and git repository url</p>


<h6>step2</h6>
<p>In jenkins will go to the Managejenkins and install all the maven,docker,git pluggins</p>


<h6>step2</h6>
<p>In jenkins will go the globalsystem will select the maven version that we installed previously</p>


<h6>step2</h6>
<p>And while creating build will enter docker credentials</p>