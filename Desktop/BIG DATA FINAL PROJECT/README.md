# Kigali Road Crash Data Analysis – Capstone Project

**Course:** Introduction to Big Data Analytics  
**Student:** Vanessa Gatete  
**Instructor:** Eric Maniraguha  

##  Introduction

In this capstone project, I worked with a cleaned dataset provided by the Kigali Traffic Police to analyze patterns in road crashes that occurred in Kigali. The goal of the project was to gain insights from the crash data using both Python and Power BI, and to make meaningful conclusions that could help improve road safety. I applied techniques such as data cleaning, exploratory data analysis (EDA), clustering with machine learning, and interactive dashboard creation.

This project is divided into two main parts:  
🔹 **Python-based Data Analysis and Machine Learning**  
🔹 **Power BI Interactive Dashboard**

##  PART 1: PYTHON DATA ANALYSIS

### 1. Handle Missing Values
I started by inspecting the dataset for missing values using `df.isnull().sum()`. For numeric columns like `age`, I used the **median** to fill in missing values to reduce the influence of outliers. For categorical columns like `weather_condition`, I used the **mode** (most frequent value).

![Missing Values](<images/checking for missing values .png>)
![Fill missing values ](<images/handle missing values .png>)

### 2. Handle Inconsistent Formats
Some columns had inconsistent formats, especially in text. For example, the column `gender` had values like `"Male"`, `"male"`, and `"MALE"`. I used `str.lower().strip()` to make all values lowercase and remove extra spaces to ensure uniformity.
![inconsistent formats](<images/inconsistent format.png>)

### 3. Handle Outliers
To detect and remove outliers, I used **boxplots** and calculated the **Z-score**. For example, crash times or ages that were far beyond the usual range were marked as outliers and handled to avoid skewing the analysis.

![Outliers](<images/outliers.png>)

### 4. Apply Encoding
Since machine learning models can't work with text directly, I used **label encoding** to convert categorical columns (like `road_type`, `weather_condition`, and `gender`) into numerical values.

![Encoding](<images/Encoding .png>)

### 5. Apply Scaling
I applied **StandardScaler** from `sklearn.preprocessing` to normalize the numeric features. This ensures that all variables contribute equally during clustering by bringing them onto the same scale.

![Scaling](<images/scaling .png>)

### 6. Generate Descriptive Statistics
To understand the dataset better, I used `df.describe()` and `df.info()` to get basic statistics like count, mean, min, and max. This gave me a good overview of how each column behaves.

![descriptive statistics](<images/descriptive statistics .png>)

### 7. Visualize Distributions
I used **Seaborn** and **Matplotlib** to plot:
- Histograms of age
- Countplots for gender, weather, and outcomes  
These helped me understand how the values were spread out in each column.

![visualize Distributions ](<images/visualize.png>)


### 8. Visualize Relationships Among Variables
I created **scatter plots**, **bar charts**, and **correlation heatmaps** to see how different variables relate to each other. For example, I checked if certain weather conditions are linked to higher crash severity.

![Relationship between variables ](<images/relationship between them.png>)

### 9. Train the Model on the Dataset
I used **K-Means Clustering** to group similar crash incidents together. I trained the model using important numeric features like `age`, `hour_of_crash`, and `day_of_week`. This helped identify patterns such as common times when crashes happen.
![Training Model ](<images/model training with logistic.png.>)

### 10. Use Appropriate Evaluation Metrics
Since clustering is an unsupervised learning method, I used the **Silhouette Score** to evaluate the performance of the K-means model. This score shows how well-defined the clusters are.

![Evaluation ](<images/model evaluation .png>)

### 11. Use Modular Functions
Instead of writing everything in one big chunk, I created **modular functions** like:
- `clean_data(df)`
- `scale_data(df)`
- `plot_distributions(df)`
- `train_kmeans(df)`
This made the code reusable and easy to manage.

![Modular function](<images/modular function .png>)

### 12. Include Markdown and Comments
I added markdown cells before each step to explain what I was doing. I also included comments inside code cells using `#` so that other people (or future me) can easily understand and follow the logic. the following are some  markdown  screenshot:

![1 ](<images/importing markdown .png>)
![2 ](<images/loading markdown .png>)
![3](<images/missing values markdown .png>)
![4](<images/converting  markdown .png>)
![5 ](<images/clean categories markdown .png>)
![6 ](<images/dataset shape markdown .png>)
![7 ](<images/clean markdown .png>)
![8 ](<images/load the dataset markdown.png>)
![9 ](<images/visualize markdown .png>)
![10 ](<images/encoding markdown .png>)
![11](<images/scale markdown .png>)
![12](<images/model training markdown.png>)
![13](<images/detect outliers markdown .png>)
![14](<images/feature and target markdown .png>)
![15](<images/relationship markdown .png>)
![16](<images/converting  markdown .png>)
![17](<images/descriptive statistics markdown .png>)
![18](<images/model evaluation markdown .png>)
![19](<images/innovation markdown .png>)
![20](<images/importing markdown .png>)

### 13. Add Custom or Innovative Techniques
To enhance the project, I added a **custom function** that summarizes the characteristics of each cluster from the K-Means model. I also visualized these clusters with scatter plots to clearly separate the groupings.

![Innovation ](<images/innovation.png>)

## PART 2: POWER BI DASHBOARD

### 1. Clearly Communicate the Problem and Insights
My dashboard starts with an **overview section** showing the main problem: increasing road crashes in Kigali. I summarized total crashes, outcomes, and key demographics using card visuals.

![Power bi ](<images/power bi dashbord .png>)

### 2. Add Interactivity
I included **slicers** to filter data by:
- Gender
- Weather condition
- Day of week  
This made it easy to explore trends without writing queries.


### 3. Use Appropriate Visuals
Some of the visuals I used:
- **Bar chart**: Age group vs crash outcome
- **Line chart**: Crash frequency over time
- **Column chart**: Day of week vs number of crashes

### 4. Ensure Dashboard Design is Clear
I used a **clean white background** with consistent colors (blues and greys). I grouped related visuals and added clear **titles** and **legends** to improve readability.

### 5. Add Creative Elements
I added:
- **Drill-down charts** so that viewers can explore time-based patterns
- **Custom tooltips** to display detailed info when hovering
- **Filters** that control all visuals together

##  conclusion 

This capstone project gave me hands-on experience in cleaning data, performing exploratory analysis, and applying machine learning in Python. I also learned how to present data professionally using Power BI. The insights I discovered can help inform better road safety policies and understand the most common risk factors in Kigali road crashes.




