//create db
db = db.getSiblingDB("job");

// create user
db.createUser({
    user : "job_user",
    pwd : "job_password",
    roles : [
        {
            role : "readWrite",
            db:"job"
        }
    ]
});


// create collection
db.createCollection('job');


// create docs
db.job.insertMany([
    {
        desc : "senior java dev",
        company: "amazon",
        skills :[ "java", "spring","docker"],
        salary: 100000,
        isRemote: false
    },
    {
        desc : "junior java dev",
        company: "apple",
        skills :[ "java"],
        salary: 50000,
        isRemote: false
    },{
        desc : "scrum master",
        company: "google",
        skills :[ "agile", "jira"],
        salary: 60000,
        isRemote: true
    },{
        desc : "director of engg",
        company: "microsoft",
        skills :[ "java","project", "jira"],
        salary: 150000,
        isRemote: true
    }])