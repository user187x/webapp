# Building (Docker)
- docker build -t webapp:1.0.0 .

# Push image to docker repo
- docker login
- docker image push <YourDockerID>/webapp:1.0.0

# Running Service (Docker)
- docker run -d --name webapp -p 8080:8080 webapp:1.0.0

# Stopping a Service (Docker)
- docker stop webapp

# Resuming Service (Docker)
- docker start webapp

# Verify Running (Docker)
- docker ps -a

# Removing Service (Docker)
- docker rm <container_id>

## K8s ##

# Deploy to K8s
- kubectl apply -f deployment.yml

# Verify
- kubectl describe deployment webapp

# Scale up deployment
- kubectl scale deployments/webapp --replicas=2

# Removing Deployment
- kubectl delete deployment webapp-deploy